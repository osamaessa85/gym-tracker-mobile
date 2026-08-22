# Gym Tracker — Android & iPhone

هذا المشروع يحتوي على نسخة Web أصلية للتطبيق ونسختين Mobile wrapper مستقلتين:

- `android-native/` تطبيق Android أصلي بسيط يستخدم WebView ويخزن ملفات التطبيق محلياً.
- `ios-native/` تطبيق iPhone/iPad أصلي بسيط يستخدم WKWebView ويضم ملفات التطبيق محلياً.
- `www/` هو كود Gym Tracker الأصلي.

## Android
من مجلد `android-native` شغّل Gradle 8.9+ ثم:
`gradle assembleDebug`
وسيظهر APK في `app/build/outputs/apk/debug/`.

## iOS
على macOS مع Xcode وXcodeGen:
`brew install xcodegen`
ثم داخل `ios-native`:
`xcodegen generate`
ثم افتح `GymTrackerApp.xcodeproj` في Xcode وابنِ التطبيق.

## GitHub Actions
المجلد `.github/workflows` يحتوي workflow إضافي للبناء التلقائي. بعد رفع المشروع إلى GitHub يمكن الحصول على APK من Artifacts.

ملاحظة: توقيع iOS وتوزيعه في App Store يحتاج حساب Apple Developer، وهو أمر لا يمكن إنجازه بدون حسابك.
