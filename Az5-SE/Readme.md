# گزارش

## توضیح Abstract Factory

در این بخش ابتدا تست ها را طراحی کرده و سپس به کمک آن ها مدل را پیاده سازی میکنیم.
همانطور که در ویدیو گفته شده بود هدف ساخت دو نوع درخت و گل ایرنی و ژاپنی است برای این کار دو نوع Garden Creator ایجاد کرده و به کمک آن ها مدل را میسازیم. تست ها همگی به درستی قبول شده اند.

<img width="1330" alt="Screenshot 2022-12-09 at 1 10 50 PM" src="https://user-images.githubusercontent.com/45598863/206701321-21a0efc7-d7f5-4ffd-8f64-77a994a4e544.png">
<img width="1435" alt="Screenshot 2022-12-09 at 1 39 47 PM" src="https://user-images.githubusercontent.com/45598863/206701352-94d49204-9c21-4aa2-be3d-b3396dbc8dc6.png">


## توضیح Prototype

در این بخش طراحی یک روش برای ایجاد یک clone برای یک شی است برا این کار کافیست کلاس مورد نظر را از واسط Clonable ارث بری کرده و تابع clone را پیاده سازی کنیم. برای طراحی این بخش نیز از روش TDD استفاده شده است . شی مورد نظر اینجا یه دایره است.
<img width="1299" alt="Screenshot 2022-12-09 at 2 18 34 PM" src="https://user-images.githubusercontent.com/45598863/206701816-5b419c1b-137f-4b7e-8388-093dfefde3b9.png">
<img width="1201" alt="Screenshot 2022-12-09 at 3 54 10 PM" src="https://user-images.githubusercontent.com/45598863/206701888-0d27f881-a3a6-49d5-b67a-bc62099be855.png">

## توضیح Builder

در این بخش هدف طراحی یک برنامه به کمک پترن Builder است. در این بخش سعی شده به کمک این پترن یک لپتاپ را ایجاد کرد. دو نوع لپتاپ داریم Asus و MacLaptop که ابتدا برای هر دوی آن ها Builder را طراحی کرده و به کمک تابع های construct در Director ویژگی های هر یک را میسازیم. در این بخش نیز از روش TDD استفاده شده است.
<img width="1341" alt="Screenshot 2022-12-09 at 3 27 20 PM" src="https://user-images.githubusercontent.com/45598863/206702568-b9680196-932d-43cc-b43f-ccf3245d1356.png">
<img width="1396" alt="Screenshot 2022-12-09 at 3 39 35 PM" src="https://user-images.githubusercontent.com/45598863/206702619-3756d929-0965-40a2-857a-6760f89be1c7.png">


# سوالات

## 2

### Creational Patterns
These design patterns provide a way to create objects while hiding the creation logic, rather than instantiating objects directly using new operator. This gives program more flexibility in deciding which objects need to be created for a given use case.

