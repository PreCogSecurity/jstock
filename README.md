# JStock

JStock is a free stock market software for 27 countries. It provides Stock watchlist, Intraday stock price snapshot, Stock indicator editor, Stock indicator scanner and Portfolio management. Free SMS/email alert supported. It integrates seamless with Android. JStock Android can be downloaded separately from http://goo.gl/t24hN

JStock long term product roadmap can be found from http://goo.gl/55gGQS and http://goo.gl/ClN7zT

[![Gitter chat](https://badges.gitter.im/yccheok/client-app.png)](https://gitter.im/yccheok/jstock)

---

## Getting Started

### Prerequisites
- JDK 8 or higher
- Maven 3.x (or Ant via NetBeans project configuration)

### Build
To compile the project and build binaries:
```bash
mvn clean compile
```

### Test
To run the test suite:
```bash
mvn test
```

### Run
To execute the application:
```bash
java -jar target/jstock.jar
```

---

## Environment Configuration

Copy `.env.example` to `.env` and configure runtime parameters such as:
- `HTTP_X_FORWARDED_FOR`
- `REMOTE_ADDR`

---

## Architecture

The codebase is organized under `org.yccheok.jstock`:
- `engine`: Core financial calculation, stock data types, and market search engines.
- `portfolio`: Portfolio management, transactions, dividends, and deposit tracking.
- `watchlist`: Watchlist data structures and management.
- `network`: HTTP utilities, proxy detection, and network communication.
- `gui`: Swing-based user interface components, dialogs, charts, and table models.
- `internationalization`: Message bundles and localization support.
- `file`: CSV/Excel export, file persistence, and data parsing.
