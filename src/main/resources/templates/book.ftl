<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <table style="border-collapse: collapse" border="1">
        <tr>
            <td>编号</td>
            <td>书名</td>
            <td>作者</td>
        </tr>
        <#list books as book>
            <tr>
                <td>${book.id}</td>
                <td>${book.name}</td>
                <td>${book.author}</td>
            </tr>
        </#list>
    </table>
</body>
</html>