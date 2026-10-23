\# 🎙️ Multilingual Real-Time Speech-to-Text Studio



A real-time bilingual (Hindi \& English) speech-to-text web application built with \*\*Java 21\*\*, \*\*Spring Boot 3\*\*, \*\*PostgreSQL (Supabase)\*\*, and modern browser speech APIs. It features low-latency voice capture, audio visualization, full CRUD history persistence, and dynamic Text-to-Speech (TTS) audio playback.



Developed for the \*\*Procucev AI Technical Hiring Assignment\*\*.



\---



\## 🌐 Live Demo \& Repository

\- \*\*Live Application:\*\* \[https://procucev-multilingual-stt.onrender.com/](https://procucev-multilingual-stt.onrender.com/)

\- \*\*GitHub Repository:\*\* \[https://github.com/bhavankumarv/procucev-multilingual-stt](https://github.com/bhavankumarv/procucev-multilingual-stt)



\---



\## ✨ Features



\- \*\*Real-Time Speech-to-Text:\*\* Continuous audio streaming with instant word transcription as you speak.

\- \*\*Multilingual / Dialect Selection:\*\*

&#x20; - \*\*English (India - `en-IN`):\*\* Transcribes Indian English into standard Latin script without phonetic transliteration corruption.

&#x20; - \*\*Hindi (`hi-IN`):\*\* Transcribes pure Hindi directly into clean Devanagari script.

&#x20; - \*\*English (US - `en-US`):\*\* Standard Western English dialect support.

\- \*\*Interactive UI \& Visualizer:\*\* Glassmorphic dark dashboard with active soundbar frequency visualization, word/character counter, and instant clipboard copy.

\- \*\*Full CRUD Persistence:\*\* Complete REST API integration allowing users to \*\*Create\*\*, \*\*Read\*\*, \*\*Update\*\*, and \*\*Delete\*\* transcription records stored in Supabase PostgreSQL.

\- \*\*Dialect-Aware Text-to-Speech (TTS):\*\* Playback engine that routes spoken audio to the appropriate localized voice engine based on the detected language tag.



\---



\## 🛠️ Architecture \& Tech Stack

