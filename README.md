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
ابتدا scenario outline آورده شده در صورت مسئله را اضافه می‌کنیم. یک نمونه سناریو ضرب عادی هم قرار می‌دهیم.

<img width="632" alt="image" src="https://github.com/ShayanEmzed/SEL-HW3/assets/60621655/f0b166fe-4b92-4a8e-bb1c-5d4f821ae23b">


حال MyStepdefs تعریف شده در سوال قبلی را به نوعی تغییر می‌دهیم که سناریو بالا مطابقت داشته باشد. به طور خاص بخش When را باید به صورت زیر عوض کنیم.

<img width="512" alt="image" src="https://github.com/ShayanEmzed/SEL-HW3/assets/60621655/f8216cb8-ef83-48ac-99c4-0fb06d4b40c8">

در پایان، کلاس Calculator را طبق نیازهای سناریو پیاده می‌کنیم.

<img width="456" alt="image" src="https://github.com/ShayanEmzed/SEL-HW3/assets/60621655/ed7b7428-ea84-4e99-a774-299caa9b4c66">

همینطور می‌توان دید که تمامی مثال‌ها پاس شده‌اند:

<img width="612" alt="image" src="https://github.com/ShayanEmzed/SEL-HW3/assets/60621655/2e90eda1-ea65-42d3-b3d3-8233aae3c59d">



