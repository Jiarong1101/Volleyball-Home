# 🏐 Volleyball Home
Volleyball Home 是一款智慧排球訓練系統，結合 **MediaPipe 姿勢辨識**、**AWS Rekognition 機器學習**、  
以及 **Android App 前端介面**，讓使用者能即時辨識排球動作並獲得分數或訓練回饋。

> ⚠️ 本版本僅作為展示與紀錄用途，並非完整可執行系統。  
> 完整系統已於專題報告與 YouTube Demo 影片中展示。

---

## 🎯 專案簡介
這個專案的核心構想來自「**讓排球愛好者隨時隨地練習動作**」。

系統由三部分組成：
1. 📱 **Android 前端**：提供登入、排球場、商城與論壇介面。
2. 🧠 **Flask + MediaPipe 模組**：電腦端鏡頭即時偵測使用者骨架，並計分。
3. 🤖 **AWS Rekognition 模型**：利用上千張圖片訓練排球動作辨識，達到 98% 準確率。

---

## 🧠 使用技術
| 類別 | 技術說明 |
|------|-----------|
| 骨架辨識 | MediaPipe, OpenCV |
| 機器學習 | AWS Rekognition (影像分類模型) |
| 後端伺服器 | Python Flask |
| 手機介面 | Android Studio (Java) |
| 影像整合 | CameraX, Flask Streaming |
| 文件與設計 | Microsoft Word / PowerPoint / Figma |

---

## 📺 Demo 影片
| 類別 | 連結 |
|------|------|
| 🎥 系統總覽展示 | [YouTube 影片](https://www.youtube.com/watch?v=U11AAnBjDAo) |


---

## 📂 資料夾說明
| 資料夾名稱 | 說明 |
|-------------|------|
| `Android-Frontend` | 僅包含 Android UI，未與後端串接 |
| `Flask-MediaPipe` | Python Flask 伺服器與骨架偵測原型 |
| `AWS-Rekognition` | 使用 AWS 訓練的影像辨識模型說明 |
| `MediaPipe-Notebooks` | MediaPipe 各姿勢辨識模型（Jupyter Notebook） |
| `Report` | 專題報告 PDF 文件 |
| `Demo-Videos` | YouTube Demo 影片與截圖 |

---

## 👩‍💻 專案成員
- 張家榕
- 楊澤宥
- 蔡東穎
- 俞呈翰
- 胡志碩

---

## 📣 專案榮譽
🏆 入圍 「國際 ICT 創新服務獎」全國決賽
🥉 榮獲 「東吳大學專題競賽」第三名

## ⚠️ 注意事項
- 本 Repository 主要用於展示成果與專題架構，程式並非完整可執行版本。
- AWS 模型權限與訓練資料未公開。
- 所有影片與截圖僅供學術與展示用途。

---

## 📜 授權
本專案僅供學術展示與教育用途，禁止未經授權的商業使用。
