# DEVTOPIA-BE

## 셋업
1. application-local.properties 파일 생성 후 값을 채워넣어주세요.
    ```shell
    cp src/main/resources/application-prod.properties src/main/resources/application-local.properties
    ```
2. 프로젝트 실행 시 ActiveProfile을 `local`로 설정해주세요.
    application-local.properties 파일을 읽어오도록 설정해주는 행위입니다.

## 주요 의존성
- Kotlin: 1.9.24
- Spring boot: 3.3
- Gradle: 8.8
- JDK: 17