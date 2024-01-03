-- 코드를 입력하세요
--상반기 동안 각 아이스크림 성분 타입과 성분 타입에 대한 아이스크림의 총주문량을 총주문량이 작은 순서대로 조회
SELECT I.INGREDIENT_TYPE,sum(H.total_order) as TOTAL_ORDER
from FIRST_HALF H join ICECREAM_INFO I on H.FLAVOR = I.FLAVOR
group by I.INGREDIENT_TYPE
order by TOTAL_ORDER asc