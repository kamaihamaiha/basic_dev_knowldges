## HTTP 的 Header 和 Body



### Header

是 HTTP 消息的元数据(metadata)，也就是数据的数据。数据的属性，如：类型、大小

- Host: 目标主机地址。
  - 用来给服务器中的主机看的，定位到具体的子主机，从而定位到子主机运行的服务
- Content-Length: Body 的长度
- Content-Type: Body 的类型
  - text/html: html 文本，用于浏览器页面响应
  - application/json：
    - json 形式
  - application/x-www-form-urlencoded: 普通表单，encoded URL 格式
  - multipart/form-data: 
    - 用 boundary 作划分
    - 通常上传图片需要这种方式
    - 如果用普通表单，base64 传递图片，就不合适了
  - image/jpeg 或者 application/zip ...
    - 只上传图片
    - 很少有人用，很多人不知道
- Transfer-Encoding
- Location: 重定向的目标 URL 
- User-Agent：用户代理
- [Range / Accept-Ranges](header_range/readme.md)
- Cookie / Set-Cookie
- Authorization
- Cache
- 部分其他 Header
  - Accept: 客户端能接受的数据类型。如 `text/html`
  - Accept-Charset: 客户端接受的字符集。如 `utf-8`
  - Accept-Encoding: 客户端接受的压缩编码类型。如 `gzip`
  - Content-Encoding: 压缩类型。如 `gzip`

#### Chunked Transfer Encoding

 - 分块传输编码. 是 Header 的一个属性，使用方式：
```
Transfer-Encoding: chunked
```
- 表示 body 长度无法确定，Content-Length 不能使用.
- Body 格式：
  ```

  ```

#### Cache

- Cache 和 Buffer 的区别
  - Cache: 缓存
  - Buffer: 缓冲









