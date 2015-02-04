<!DOCTYPE tiles-definitions PUBLIC "-//Apache Software Foundation//DTD Tiles Configuration 2.1//EN" "http://tiles.apache.org/dtds/tiles-config_2_1.dtd">
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<table border="1" cellpadding="2" cellspacing="2" align="center">
    <tbody><tr>
        <td height="30" colspan="2"><tiles:insertAttribute name="header">
        </tiles:insertAttribute>
        </td>
    </tr>
    <tr>
        <td height="250"><tiles:insertAttribute name="menu"></tiles:insertAttribute></td>
        <td width="350"><tiles:insertAttribute name="body"></tiles:insertAttribute></td>
    </tr>
    <tr>
        <td height="30" colspan="2"><tiles:insertAttribute name="footer">
        </tiles:insertAttribute></td>
    </tr>
</tbody></table>