# گزارش

## توضیح کد
در ابتدا بعد از ساختن پروژه به سراغ ساختن تست ها میرویم در ابتدا تست مربوط به مقدار دهی length مستطیل را طراحی میکنیم
<img width="1033" alt="Screenshot 2022-12-02 at 12 01 05 PM" src="https://user-images.githubusercontent.com/45598863/205261181-dcd8236e-e06f-4e96-9295-fe05a3366189.png">

سپس به سراغ طراحی مدل برای رفع کردن کامپایل ارور میرویم و کلاس مستطیل را میسازیم در ابتدا از روش fake it برای تست استفاده میکنیم . سپس مقدار را طوری قرار میدهیم تا تست پاس شود و در آخر کد اصلی را قرار میدهیم. به همین شکل بقیه تست ها و متد ها را اضافه میکنیم. در ادامه نیز مدل را طوری تغییر میدهیم تا مبتوان مربع را نیز طراحی کرد در این بخش هر دوی مستطیل و مربع را از یک کلاس به نام shape به ارث میبریم دلیل آن که چرا مربع از مستطیل ارث بری نمیکند در قسمت دستور کار ذکر شده است. متذکر میشویم که در این بخش اجازه ی تغییر طول و عرض مستطیل وجود دارد.

<img width="1156" alt="Screenshot 2022-12-02 at 12 06 09 PM" src="https://user-images.githubusercontent.com/45598863/205262253-d4559e83-db72-4d7d-8a55-66c1550f2a93.png">
<img width="1345" alt="Screenshot 2022-12-02 at 12 06 37 PM" src="https://user-images.githubusercontent.com/45598863/205262290-8bc409a5-4120-4241-8a0d-6687471e01ba.png">
<img width="1125" alt="Screenshot 2022-12-02 at 12 07 06 PM" src="https://user-images.githubusercontent.com/45598863/205262531-ac68cc3a-1770-44e1-8fd2-39dec31643a0.png">
<img width="1056" alt="Screenshot 2022-12-02 at 12 07 28 PM" src="https://user-images.githubusercontent.com/45598863/205263061-81dbbb38-4577-46dc-b6b7-a793a53ab551.png">
<img width="1039" alt="Screenshot 2022-12-02 at 1 08 51 PM" src="https://user-images.githubusercontent.com/45598863/205263082-8f1743e9-197e-4b70-aa3e-a6ea3f9ddd05.png">
<img width="1113" alt="Screenshot 2022-12-02 at 12 07 43 PM" src="https://user-images.githubusercontent.com/45598863/205263349-a107ef9c-03a9-4734-b0dc-ee3ead2a8818.png">
<img width="1039" alt="Screenshot 2022-12-02 at 1 08 51 PM" src="https://user-images.githubusercontent.com/45598863/205263406-e7819c48-b088-41c7-b5be-bfe49e3a4978.png">

<img width="1326" alt="Screenshot 2022-12-02 at 12 14 11 PM" src="https://user-images.githubusercontent.com/45598863/205263618-b72a9b50-d446-4b5f-b8f2-135cf5ad28e0.png">
<img width="1456" alt="Screenshot 2022-12-02 at 12 14 02 PM" src="https://user-images.githubusercontent.com/45598863/205263654-84926929-acc8-4f6a-9744-c5c9044f3293.png">

<img width="600" alt="Screenshot 2022-12-02 at 12 43 50 PM" src="https://user-images.githubusercontent.com/45598863/205264541-c4cb3f90-3c0a-41d6-928a-8702a2e09146.png">
<img width="600" alt="Screenshot 2022-12-02 at 12 43 56 PM" src="https://user-images.githubusercontent.com/45598863/205264553-ca751bf4-aabe-43b2-9d7c-763dd45ac650.png">
<img width="1152" alt="Screenshot 2022-12-02 at 1 19 50 PM" src="https://user-images.githubusercontent.com/45598863/205265111-15cd0843-6cb5-4908-ae86-cae32cbf5436.png">
....

## سوالات
### 1
نام کامل اصول SOLID به شرح زیر است:
Single Responsibility, Open/Closed, Liskov substitution, Interface segregation, and Dependency inversion
Single responsibility:
این اصل میگوید که هر کلاس مسئولیت پاسخگویی به فقط یک Actor را دارد. یعنی درواقع هر کلاس نباید بیشتر از یک دلیل برای تغییر داشته باشد. حتی اگر کارهای مختلفی انجام دهد.
Open/Closed principle: 
### 2

### 3

### 4
هنگامی که تغییرات طول و عرض مجاز نباشد میتوان کلاس مربع را از کلاس مستطیل ارث بری که و دیگر نیازی به تشگیل گلاس shape نیست.
