# Проект автоматизации тестирования TesterToday

![Java](https://img.shields.io/badge/Java-Corretto--17-orange)
![Maven](https://img.shields.io/badge/Maven-4.0.0-yellow)
![TestNG](https://img.shields.io/badge/TestNG-7.12.0-blue)
![Selenide](https://img.shields.io/badge/Selenide-7.14.0-green)
![REST Assured](https://img.shields.io/badge/REST%20Assured-6.0.0-brightgreen)
![JSON Schema Validator](https://img.shields.io/badge/JSON%20Schema%20Validator-6.0.0-pink)

Этот многомодульный проект содержит набор автоматизированных UI- и API-тестов для веб-приложения **TesterToday**. 
## Технологический стек

*   **Язык:** JDK Corretto-17
*   **Сборка:** Apache Maven
*   **Тестирование:** TestNG 7.12.0, Selenide 7.14.0, REST Assured 6.0.0
*   **Утилиты:** JSON Schema Validator 6.0.0

## Описание тестовых сценариев

### UI-тесты:

#### Регистрация
*   **Успешная регистрация:** Проверка создания нового пользователя с валидными данными (имя, пароль). После регистрации происходит автоматический редирект на главную страницу.

### API-тесты:

#### 1. Модули блока "Введение"
Параметризованный тест проверяет успешное открытие модулей в блоке "Введение":
*   Модуль "Тестировщик".
*   Модуль "Работа в команде по методологии Scrum".
*   Модуль "Жизненный цикл ПО".
*   Модуль "Архитектура приложения".

#### 2. Валидация json
Проверяется соответствие полученного json заданной схеме.

## Структура проекта
```
TesterToday/
├── pom.xml                    # Родительский POM (общие зависимости, версии)
├── UITests/
│   ├── pom.xml                # POM для UI-тестов (наследует родительский)
│   └── src/
│       └── test/
│           └── java/
│               ├── pages/           # Page Object Model (LoginPage, MainPage)
│               └── tests/           # UI-тесты
├── APITests/
│   ├── pom.xml                # POM для API-тестов (наследует родительский)
│   ├── src/
│   │   └── test/
│   │       ├── java/
│   │       │   ├── data/             # Тестовые данные
│   │       │   ├── steps/            # Шаги API-тестов
│   │       │   ├── tests/            # API-тесты
│   │       │   └── validators/       # Валидация данных
│   │       └── resources/            # Схемы
└── README.md
```

## Требования перед запуском

1.  Установленная и настроенная **Java 17 (Corretto-17)**.
2.  Установленный **Apache Maven**.
3.  Установленный **Google Chrome** (используется WebDriverManager для автоматического скачивания драйвера).
4.  **Запущенное тестируемое приложение** `TesterToday`. 

## Запуск тестов

1.  Клонируйте репозиторий:
    ```bash
    git clone https://github.com/oksana-5/TesterToday
    cd TesterToday
2.  Выполните команду для запуска всех тестов:
    ```bash
    mvn clean test
3.  Запуск только UI-тестов:
    ```bash
    mvn clean test -pl UITests
4.  Запуск только API-тестов:
    ```bash
    mvn clean test -pl APITests

## Контакты
Оксана https://github.com/oksana-5 
