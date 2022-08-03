### HTTP 的原理和工作机制

### HTTP 的工作方式

- 浏览器中，地址栏输入地址，然后打开一个网页
- 浏览器通过内核（渲染引擎）把网页显示出来
- URL -> HTTP 报文

#### URL -> HTTP 报文

- 示例：`http://hencoder.com/users?gender=male`
  - 协议类型: http:
  - 服务器地址: //hencoder.com
  - 路径: /users?gender=male

- 转成 HTTP 请求报文
  - 请求行: GET /users?gender=male HTTP/1.1
  - Header(首部) 
    - Host: hencoder.com
    - Content-Type: text/plain
    - Content-Length: 243
    - ...
  - Body
    - 具体数据信息
    - 不是必须的

#### 服务器返回响应报文

- 状态行: HTTP/1.1 200 OK
- Headers
  - content-type: application/json; charset=utf-8
  - cache-control: public, max-age=60, s-maxage=60
  - vary: Accept,Accept-Encoding
  - etag: W/"02eec5bxxxx"
  - content-encoding: gzip
- Body
