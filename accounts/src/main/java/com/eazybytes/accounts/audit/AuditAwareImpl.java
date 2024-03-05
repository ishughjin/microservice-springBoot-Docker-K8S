package com.eazybytes.accounts.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

//  当我们正在创建数据的时候， 系统（BaseEntity）会根据服务器的时间设置， 但是CreatedBy 和ModifiedBy怎么办？ 需要编写一个小逻辑 ，而这个逻辑就是getCurrentAuditor
@Component("auditAwareImpl")
public class AuditAwareImpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor(){
        return Optional.of("ACCOUNTS_MS");
    }
}
