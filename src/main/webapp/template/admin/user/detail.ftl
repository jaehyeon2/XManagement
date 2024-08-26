<#import "/admin/layout/layoutAdmin.ftl" as layout>
<#import "/spring.ftl" as spring/>
<@layout.myLayout>

<div class="main_container">
	<#if model??>
	${model.user.userName?if_exists}
	${model.user.userEmail?if_exists}
	${model.user.userPhone?if_exists}
	${model.user.companyParentName?if_exists}
	</#if>
</div>

</@layout.myLayout>
