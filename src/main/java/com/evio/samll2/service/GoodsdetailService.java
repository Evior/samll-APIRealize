package com.evio.samll2.Service;

import com.evio.samll2.VO.GoodsdetailVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GoodsdetailService {

    GoodsdetailVO getGoodsdetailList(Integer goodsId);

}
