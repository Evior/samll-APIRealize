package com.evio.samll2.Service;

import com.evio.samll2.VO.GoodstypeVO;
import com.evio.samll2.mapper.GoodstypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GoodsTypeService {


     List<GoodstypeVO> getGoodsTypeList();


}
