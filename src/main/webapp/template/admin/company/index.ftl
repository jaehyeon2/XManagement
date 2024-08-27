<#import "/admin/layout/layoutAdmin.ftl" as layout>
<#import "/spring.ftl" as spring/>
<@layout.myLayout>

<button class="add-btn btn" onclick="location.href='/admin/company/addCompany'">회사 추가</button>
<div class="main_container">
	<#if model??>
	
	<table class="company_table">
		<thead class="company_th">
			<td class="company_td">No</td>
			<td class="company_td">회사명</td>
			<td class="company_td">회사코드</td>
			<td class="company_td">모회사</td>
		</th>
		<#list model.companyList?if_exists as company>
		<tr class="company_tr" onclick="location.href='/admin/company/detail?companyNo=${company.companyNo?if_exists}'">
			<td class="company_td">${company.companyNo?if_exists}</td>
			<td class="company_td">${company.companyName?if_exists}</td>
			<td class="company_td">${company.companyCode?if_exists}</td>
			<td class="company_td">${company.companyParentName?if_exists}</td>
		</tr>
		</#list>
		
	</table>
	<#else>
	등록된 회사가 없습니다.
	</#if>
	
</div>

</@layout.myLayout>
