package cn.edu.nju.polaris.repository;

import cn.edu.nju.polaris.entity.MultiKeysClass.SupportItemMultiKeysClass;
import cn.edu.nju.polaris.entity.SupportItem1;
import cn.edu.nju.polaris.entity.SupportItem2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface SupportItem2Repository extends JpaRepository<SupportItem2,SupportItemMultiKeysClass>{

    /**
     * 获得一个凭证行数对应的全部辅助信息二 如果没有就返回null
     * @param companyId
     * @param voucherId
     * @param voucherLines
     * @return
     */
    List<SupportItem2> findAllByCompanyIdAndVoucherIdAndVoucherLines(Long companyId, String voucherId, int voucherLines);

    /**
     * 根据公司id获得所有记录
     * @param companyId
     * @return
     */
    List<SupportItem2> findAllByCompanyId(Long companyId);
    /**
     * 删除一个凭证行数对应的全部辅助信息二
     * @param companyId
     * @param voucherId
     * @param voucherLines
     */
    @Transactional
    void deleteAllByCompanyIdAndVoucherIdAndVoucherLines(Long companyId,String voucherId,int voucherLines);

    /**
     * 删除辅助信息一种的一行
     * @param companyId
     * @param voucherId
     * @param voucherLines
     * @param supportLines
     */
    @Transactional
    void deleteByCompanyIdAndVoucherIdAndVoucherLinesAndSupportLines(Long companyId,String voucherId,int voucherLines,int supportLines);


    @Transactional
    void deleteByCompanyIdAndVoucherId(Long companyId,String voucherId);
}
