SELECT I.REST_ID, I.REST_NAME, I.FOOD_TYPE, I.FAVORITES, I.ADDRESS, ROUND(AVG(A.REVIEW_SCORE),2) AS SCORE 
 FROM REST_INFO I JOIN REST_REVIEW A on I.REST_ID = A.REST_ID
 WHERE ADDRESS LIKE '서울%'
 GROUP BY i.rest_id, i.rest_name, i.food_type, i.favorites, i.address
 ORDER BY SCORE DESC, I.FAVORITES DESC;