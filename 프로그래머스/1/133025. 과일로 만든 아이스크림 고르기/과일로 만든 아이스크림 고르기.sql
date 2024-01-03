-- 코드를 입력하세요
select H.FLAVOR from FIRST_HALF H join ICECREAM_INFO I on H.flavor = I.flavor
where I.INGREDIENT_TYPE = 'fruit_based' and H.TOTAL_ORDER >=3000