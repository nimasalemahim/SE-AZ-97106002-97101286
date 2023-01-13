package parser;

import scanner.token.Token;

import java.util.ArrayList;

public class Rule {
    public Rule(String stringRule) {
        int index = stringRule.indexOf("#");
        if (index != -1) {
            try {
                semanticAction = Integer.parseInt(stringRule.substring(index + 1));
            } catch (NumberFormatException ex) {
                semanticAction = 0;
            }
            stringRule = stringRule.substring(0, index);
        } else {
            semanticAction = 0;
        }
        String[] splited = stringRule.split("->");
        LHS = NonTerminal.valueOf(splited[0]);
        RHS = new ArrayList<GrammarSymbol>();
        if (splited.length > 1) {
            String[] RHSs = splited[1].split(" ");
            for (String s : RHSs) {
                try {
                    RHS.add(new GrammarSymbol(NonTerminal.valueOf(s)));
                } catch (Exception e) {
                    RHS.add(new GrammarSymbol(new Token(Token.getTyepFormString(s), s)));
                }
            }
        }
    }

    public NonTerminal LHS;
    public ArrayList<GrammarSymbol> RHS;
    public int semanticAction;
}

class GrammarSymbol {
    public GrammarSymbolType grammarSymbolType;

    public GrammarSymbol(NonTerminal nonTerminal) {
        grammarSymbolType = new NonTerminalGrammarSymbol(nonTerminal);
    }

    public GrammarSymbol(Token terminal) {
        grammarSymbolType = new TerminalGrammarSymbol(terminal);
    }
}

class GrammarSymbolType {

}

class NonTerminalGrammarSymbol extends GrammarSymbolType {
    public NonTerminal nonTerminal;

    public NonTerminalGrammarSymbol(NonTerminal nonTerminal) {
        this.nonTerminal = nonTerminal;
    }
}

class TerminalGrammarSymbol extends GrammarSymbolType {
    public Token terminal;

    public TerminalGrammarSymbol(Token terminal) {
        this.terminal = terminal;
    }
}