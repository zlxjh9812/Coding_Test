-- 코드를 입력하세요
SELECT  '/home/grep/src/'||ugf.BOARD_ID||'/'||ugf.FILE_ID||FILE_NAME||ugf.FILE_EXT as file_path
from USED_GOODS_FILE UGF join USED_GOODS_BOARD UGB on ugf.board_id = ugb.board_id
where ugb.views=(select max(views) from USED_GOODS_BOARD)
order by ugf.file_id desc