<#import "/admin/layout/layoutAdmin.ftl" as layout>
<#import "/spring.ftl" as spring/>
<@layout.myLayout>

<button class="add-btn btn" onclick="location.href='/admin/company/addCompany'">회사 추가</button>
<div class="main_container">
	<#if model.company??>
	<div class="company_item">회사명</div> <div class="company_info">${model.company.companyName?if_exists}</div>
	<div class="company_item">회사코드</div> <div class="company_info">${model.company.companyCode?if_exists}</div>
	<div class="company_item">회사주소</div> <div class="company_info">${model.company.companyAddress?if_exists}</div>
	<div class="company_item">회사우편번호</div> <div class="company_info">${model.company.companyZip?if_exists}</div>
	<div class="company_item">회사등록일</div> <div class="company_info">${model.company.insertDate?string("yyyy/MM/dd HH:mm")?if_exists}</div>
	<#else>
	등록된 정보가 없습니다.
	</#if>
	
</div>

</@layout.myLayout>
