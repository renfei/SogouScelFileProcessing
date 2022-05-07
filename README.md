# SogouScelFileProcessing

搜狗输入法词库 Scel 文件转换为 txt 文件的 Java 处理实现。

## 现有词库

我也准备好了现成的词典库：[https://github.com/renfei/dict](https://github.com/renfei/dict)

## 使用示例
Scel 文件在我本机的路径是 ```/Users/renfei/Downloads/财会词汇大全.scel``` 将其转换到 ```/Users/renfei/Downloads/财会词汇大全.txt``` :

```java
FileProcessing scel = new SogouScelFileProcessing();
scel.parseFile(Objects.requireNonNull("/Users/renfei/Downloads/财会词汇大全.scel", "/Users/renfei/Downloads/财会词汇大全.txt", true);
```

将文件夹下所有 Scel 文件转到同一个 txt 文件：

```java
FileProcessing scel = new SogouScelFileProcessing();
scel.parseFiles("/Users/renfei/Downloads", "/Users/renfei/Downloads/txt/汇总.txt", false);
```

将文件夹下所有 Scel 文件转到各自的 txt 文件：

```java
FileProcessing scel = new SogouScelFileProcessing();
scel.setTargetDir("/Users/renfei/Downloads/多对多");
scel.parseFile("/Users/renfei/Downloads", false);
```