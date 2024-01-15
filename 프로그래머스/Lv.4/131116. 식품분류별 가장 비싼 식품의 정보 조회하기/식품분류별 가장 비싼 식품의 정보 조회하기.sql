-- 코드를 입력하세요
select A.CATEGORY,A.price as MAX_PRICE,B.PRODUCT_NAME
from 
(SELECT max(PRICE) as price,CATEGORY from FOOD_PRODUCT where CATEGORY in('과자', '국', '김치', '식용유') group by CATEGORY) A join FOOD_PRODUCT B on A.CATEGORY = B.CATEGORY and A.price = B.price
order by A.price desc