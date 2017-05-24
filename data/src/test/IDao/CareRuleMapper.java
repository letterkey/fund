package test.IDao;

import test.domain.CareRule;

public interface CareRuleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CareRule record);

    int insertSelective(CareRule record);

    CareRule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CareRule record);

    int updateByPrimaryKey(CareRule record);
}