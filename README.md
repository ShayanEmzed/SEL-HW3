# SEL-HW3
یادگیری عملی روش Behavior Driven Design
## تست Undefined
همانطور که در تصویر زیر مشاهده می‌شود، پس از افزودن تست‌های scenario outline، سه تست پاس شده و یکی از تست‌ها undefined می‌شود.

<img width="677" alt="image" src="https://github.com/ShayanEmzed/SEL-HW3/assets/60621655/74744d8e-e5f0-4b93-a669-f8ba547b45a4">

با توجه به خروجی بالا تست دوم scenario outline که شامل یک عدد منفی می‌شود به مشکل خورده است. علت این مشکل تعریف regex متدها در کلاس MyStepdefs است. regex ها به نوعی تعریف شده‌اند که تنها اعداد صحیح مثبت را تشخیص دهند.  
برای حل این مشکل و در نظر گرفتن اعداد منفی، regex را به صورت زیر تغییر می‌دهیم.

<img width="436" alt="image" src="https://github.com/ShayanEmzed/SEL-HW3/assets/60621655/c758e78c-937a-4af0-bc49-6bacce525ad7">

پس از گرفتن اجرا، می‌بینیم تمامی تست‌ها پاس می‌شوند.

<img width="640" alt="image" src="https://github.com/ShayanEmzed/SEL-HW3/assets/60621655/bdee8035-ac04-4bf1-bf17-ff802bb38c9d">

در [این کامیت](https://github.com/ShayanEmzed/SEL-HW3/commit/b9ee9a4e227744cb66c992fcb280182847b6dc4a) می‌توان پروژه بدون مشکل undefined را مشاهده کرد.

## مسئله
ابتدا scenario outline آورده شده در صورت مسئله را اضافه می‌کنیم.

<img width="605" alt="image" src="https://github.com/ShayanEmzed/SEL-HW3/assets/60621655/88445685-555c-4b4b-b32f-4fc5fd7beee9">

حال MyStepdefs تعریف شده در سوال قبلی را به نوعی تغییر می‌دهیم که سناریو بالا مطابقت داشته باشد. به طور خاص بخش Given را باید به صورت زیر عوض کنیم.

<img width="649" alt="image" src="https://github.com/ShayanEmzed/SEL-HW3/assets/60621655/ee45b24b-7bdd-4b31-bef3-228fb4eded00">

در پایان، کلاس Calculator را طبق نیازهای سناریو پیاده می‌کنیم.

<img width="456" alt="image" src="https://github.com/ShayanEmzed/SEL-HW3/assets/60621655/ed7b7428-ea84-4e99-a774-299caa9b4c66">

همینطور می‌توان دید که تمامی مثال‌ها پاس شده‌اند:

<img width="640" alt="image" src="https://github.com/ShayanEmzed/SEL-HW3/assets/60621655/121da46c-f6d2-4d7b-85b4-6ae03cc91a38">


