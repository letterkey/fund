package test.IDao;

import test.domain.FundCount;

public interface FundCountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FundCount record);

    int insertSelective(FundCount record);

    FundCount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FundCount record);

    int updateByPrimaryKey(FundCount record);
}