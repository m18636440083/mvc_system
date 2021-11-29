package yan.dong.service;

import yan.dong.entity.Account;

import java.util.List;

public interface AccountService {

    /*
        查询所有
     */
    public List<Account> findAll();

    /*
        插入数据
     */
    public void save(Account account);

    /*
        查询单条数据，数据回显
     */
    public Account findById(Integer id);

    /*
        更新操作
     */
    public void update(Account account);
    /*
        批量删除
     */
    public void deleteBatch(Integer[] ids);

    /*
        单条删除
     */
    public void deleteOne(Integer id);
}
