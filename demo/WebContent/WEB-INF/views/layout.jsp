<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<table border="1" cellpadding="2" cellspacing="2" align="center">
    <tbody><tr>
        <td height="30" colspan="2"><tiles:insertattribute name="header" value="/WEB-INF/jsp/user/header.jsp">
        </tiles:insertattribute></td>
    </tr>
    <tr>
        <td height="250"><tiles:insertattribute name="menu" value="/WEB-INF/jsp/user/menu.jsp"></tiles:insertattribute></td>
        <td width="350"><tiles:insertattribute name="body" value="/WEB-INF/jsp/user/body.jsp"></tiles:insertattribute></td>
    </tr>
    <tr>
        <td height="30" colspan="2"><tiles:insertattribute name="footer" value="/WEB-INF/jsp/user/footer.jsp">
        </tiles:insertattribute></td>
    </tr>
</tbody></table>