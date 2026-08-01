# PROGRESS

## Date
2026-08-01

## Task
Menambahkan alur kerja GitHub Actions `build.yml` yang disesuaikan dengan struktur direktori proyek.

## Files Changed
- `.github/workflows/build.yml`

## Summary
File alur kerja GitHub Actions `.github/workflows/build.yml` telah dibuat dan disesuaikan secara khusus berdasarkan struktur repositori proyek saat ini (tanpa prefix direktori `V2rayNG/`). Seluruh path build, salinan pustaka `libhevtun`, pengunduhan `libv2ray.aar`, serta artefak APK yang dihasilkan telah diarahkan dengan tepat ke direktori modul `./app`.

## Technical Details
- Menghapus jalur direktori non-existing `V2rayNG/` dan menyesuaikan seluruh perintah ke `./app` (misal: `app/build.gradle.kts`, `out-file-path: app/libs/`, `path: ${{ github.workspace }}/app/build/outputs/apk/`).
- Memperbarui versi action ke versi stabil terbaru (`actions/checkout@v4`, `actions/setup-java@v4`, `actions/cache/*@v4`, `actions/upload-artifact@v4`).
- Menambahkan pemeriksaan kondisional aman saat melakukan build `compile-hevtun.sh` dan penandatanganan GPG.

## Impact Check
- UI: Aman.
- ViewModel: Aman.
- Storage/MMKV: Aman.
- Service: Aman.
- JNI/Native: Aman.
- Build System: Alur kerja GitHub Actions siap digunakan untuk build APK otomatis atau manual (workflow dispatch).

## Verification
- Build status: File `.github/workflows/build.yml` berhasil dibuat.
- Testing status: N/A (GitHub Actions Workflow).
- Remaining issue: Tidak ada.

## Next Step
- Repositori siap di-push ke GitHub untuk menjalankan alur kerja build otomatis.
