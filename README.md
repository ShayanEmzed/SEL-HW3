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

## مسئله
