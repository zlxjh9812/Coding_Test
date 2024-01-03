-- 코드를 입력하세요
SELECT MCDP_CD as "진료과코드",count(MCDP_CD) as "월예약건수"
from APPOINTMENT
where  to_char(APNT_YMD,'YYYY-MM') like '2022-05%' 
group by MCDP_CD
order by count(MCDP_CD)asc , MCDP_CD asc