package org.linlinjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.linlinjava.litemall.db.domain.LitemallAccount;
import org.linlinjava.litemall.db.domain.LitemallAccountExample;

public interface LitemallAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_account
     *
     * @mbg.generated
     */
    long countByExample(LitemallAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_account
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_account
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer adminId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_account
     *
     * @mbg.generated
     */
    int insert(LitemallAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_account
     *
     * @mbg.generated
     */
    int insertSelective(LitemallAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_account
     *
     * @mbg.generated
     */
    LitemallAccount selectOneByExample(LitemallAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_account
     *
     * @mbg.generated
     */
    LitemallAccount selectOneByExampleSelective(@Param("example") LitemallAccountExample example, @Param("selective") LitemallAccount.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_account
     *
     * @mbg.generated
     */
    List<LitemallAccount> selectByExampleSelective(@Param("example") LitemallAccountExample example, @Param("selective") LitemallAccount.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_account
     *
     * @mbg.generated
     */
    List<LitemallAccount> selectByExample(LitemallAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_account
     *
     * @mbg.generated
     */
    LitemallAccount selectByPrimaryKeySelective(@Param("adminId") Integer adminId, @Param("selective") LitemallAccount.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_account
     *
     * @mbg.generated
     */
    LitemallAccount selectByPrimaryKey(Integer adminId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_account
     *
     * @mbg.generated
     */
    LitemallAccount selectByPrimaryKeyWithLogicalDelete(@Param("adminId") Integer adminId, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_account
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallAccount record, @Param("example") LitemallAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_account
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallAccount record, @Param("example") LitemallAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_account
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_account
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_account
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") LitemallAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_account
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer adminId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_account
     *
     * @mbg.generated
     */
    int batchInsert(@Param("list") List<LitemallAccount> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_account
     *
     * @mbg.generated
     */
    int batchInsertSelective(@Param("list") List<LitemallAccount> list, @Param("selective") LitemallAccount.Column ... selective);
}