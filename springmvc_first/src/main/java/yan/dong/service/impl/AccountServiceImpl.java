package yan.dong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yan.dong.dao.AccountDao;
import yan.dong.entity.Account;
import yan.dong.service.AccountService;

import java.util.List;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    public void save(Account account) {
        accountDao.save(account);
    }

    @Override
    public Account findById(Integer id) {
        Account byId = accountDao.findById(id);
        return byId;
    }

    @Override
    public void update(Account account) {
        accountDao.update(account);
    }

    @Override
    public void deleteBatch(Integer[] ids) {
        accountDao.deleteBatch(ids);
    }

    @Override
    public void deleteOne(Integer id) {
        accountDao.deleteOne(id);
    }
}
