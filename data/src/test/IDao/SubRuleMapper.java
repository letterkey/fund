package test.IDao;

import test.domain.SubRule;

public interface SubRuleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SubRule record);

    int insertSelective(SubRule record);

    SubRule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SubRule record);

    int updateByPrimaryKey(SubRule record);
}