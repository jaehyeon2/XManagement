<#macro myLayout title="FreeMarker index">
<!DOCTYPE html>

<#include "headerAdmin.ftl"/>
<body>

<#include "naviAdmin.ftl"/>

<#nested/>

<#include "footerAdmin.ftl"/>

</body>
</html>

</#macro>