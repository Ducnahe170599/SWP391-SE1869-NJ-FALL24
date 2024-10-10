<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- Thêm khai báo JSTL -->
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Danh sách Dịch vụ</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f4f4f4;
                margin: 0;
                padding: 20px;
            }
            .container {
                max-width: 900px;
                margin: 0 auto;
                padding: 20px;
                background-color: white;
                border-radius: 10px;
                box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
            }
            h1 {
                text-align: center;
                color: #333;
            }
            table {
                width: 100%;
                border-collapse: collapse;
                margin-bottom: 20px;
            }
            th, td {
                padding: 10px;
                border: 1px solid #ddd;
                text-align: left;
            }
            th {
                background-color: #f8f8f8;
                color: #333;
            }
            td img {
                width: 50px;
                height: auto;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <h1>Danh sách Dịch vụ</h1>
            <table>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Tên dịch vụ</th>
                        <th>Loại</th>
                        <th>Phí</th>
                        <th>Mô tả</th>
                        <th>Hình ảnh</th>
                        <th>Icon</th>
                        <th> </th>  
                        <th> </th>  
                        <th> </th>
                    </tr>
                </thead>
                <tbody>
                    <!-- Lặp qua danh sách dịch vụ -->
                    <c:forEach var="service" items="${services}">
                        <tr>
                            <td>${service.serviceId}</td>
                            <td>${service.name}</td>
                            <td>${service.type}</td>
                            <td>${service.fee}</td>
                            <td>${service.description}</td>
                            <td><img src="${service.img}" alt="Hình ảnh dịch vụ"></td>
                            <td><img src="${service.icon}" alt="Icon dịch vụ"></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>