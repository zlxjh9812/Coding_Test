-- 2022년 5월인 식품들의 식품 ID, 식품 이름, 총매출
--결과는 총매출을 기준으로 내림차순 정렬해주시고 총매출이 같다면 식품 ID를 기준으로 오름차순 정렬
SELECT P.PRODUCT_ID,P.PRODUCT_NAME,sum(P.price * O.amount) as total_sales
from FOOD_PRODUCT P join FOOD_ORDER O on P.PRODUCT_ID = O.PRODUCT_ID
where to_char(PRODUCE_DATE,'YYYYMM') = '202205'
group by P.PRODUCT_ID,P.PRODUCT_NAME
order by total_sales desc,P.PRODUCT_ID asc

