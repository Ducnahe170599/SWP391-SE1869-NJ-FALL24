<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- Thêm khai báo JSTL -->
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Danh sách Hợp đồng dịch vụ</title>
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
        </style>
    </head>
    <body>
        <div class="container">
            <h1>Danh sách Hợp đồng dịch vụ</h1>
            <table>
                <thead>
                    <tr>
                        <th>Mã hợp đồng</th>
                        <th>Mã căn hộ</th>
                        <th>Mã dịch vụ</th>
                        <th>Ngày bắt đầu</th>
                        <th>Ngày kết thúc</th>
                        <th>Số tiền</th>
                        <th> </th>
                        <th> </th>
                        <th> </th>
                    </tr>
                </thead>
                <tbody>
                    <!-- Lặp qua danh sách hợp đồng dịch vụ -->
                    <c:forEach var="contract" items="${contracts}">
                        <tr>
                            <td>${contract.serviceContractId}</td>s
                            <td>${contract.apartmentId}</td>
                            <td>${contract.serviceId}</td>
                            <td>${contract.startDate}</td>
                            <td>${contract.endDate}</td>
                            <td>${contract.amount}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>