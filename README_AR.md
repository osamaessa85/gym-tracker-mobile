# Gym Tracker — نسخة الهاتف

هذه النسخة تستخدم **نفس كود Gym Tracker الأصلي** داخل Capacitor، بدل إعادة كتابة التطبيق من الصفر.

## ما تم تجهيزه
- Android + iOS عبر Capacitor.
- PWA للتثبيت المباشر من المتصفح.
- اتجاه RTL واللغة العربية افتراضيًا.
- اسم التطبيق: Gym Tracker.
- App ID: `com.osamaessa.gymtracker`.
- Supabase الموجود في التطبيق الأصلي يبقى مستخدمًا كما هو.
- التخزين المحلي الموجود في التطبيق يبقى متاحًا عند عدم تسجيل الدخول/تعذر السحابة.

## إنشاء منصتي Android وiOS

بعد فك الضغط وتشغيل Node.js:

```bash
npm run setup
```

سيتم تثبيت Capacitor وإنشاء مجلدي `android/` و`ios/` ثم مزامنة ملفات الويب.

## Android

```bash
npm run build:android
```

الناتج التجريبي سيكون داخل:
`android/app/build/outputs/apk/debug/app-debug.apk`

## iPhone

افتح المشروع على macOS مع Xcode:

```bash
npm run ios
```

ثم اختر Team في Xcode للتوقيع والنشر على جهاز iPhone أو App Store.

## ملاحظة مهمة

لا يحتاج التطبيق إلى إعادة بناء منطق التمارين أو التغذية: ملف `www/index.html` يحتوي التطبيق الأصلي كاملًا. الكود الأصلي يتضمن مستويات تدريب متدرجة، برنامجًا مستمرًا، سجل التمارين، التغذية، التقدم، التاريخ ومكتبة التمارين.

## النسخة الأصلية Android/iPhone
تمت إضافة مجلدي `android-native` و`ios-native` لبناء تطبيقين مستقلين من نفس ملفات `www`، مع GitHub Actions للبناء التلقائي.
