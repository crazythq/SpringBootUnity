package info.xiaomo.aries.base;

import info.xiaomo.core.controller.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author 小莫 (https://xiaomo.info) (https://github.com/syoubaku)
 * @version : 2017/1/11 16:41
 */
public abstract class BaseController<T> {

    protected final Logger LOGGER = LoggerFactory.getLogger(getClass());

    /**
     * 查找所有(不带分页)
     * @return result
     */
    public abstract Result<List<T>> findAll();

    /**
     * 带分页
     * @param start 起始页
     * @param pageSize 页码数
     * @return result
     */
    public abstract Result<List<T>> findAll(@PathVariable int start, @PathVariable int pageSize);

    /**
     * 根据id查看模型
     * @param id id
     * @return result
     */
    public abstract Result<T> findById(@PathVariable Long id);

    /**
     * 根据名字查找模型
     * @param name name
     * @return result
     */
    public abstract Result<T> findByName(@PathVariable String name);

    /**
     * 根据名字删除模型
     * @param name name
     * @return result
     */
    public abstract Result<String> del(@PathVariable String name);


    /**
     * 根据id删除模型
     * @param id id
     * @return result
     */
    public abstract Result<String> del(@PathVariable Long id);

    /**
     * 添加模型
     * @param model model
     * @return result
     */
    public abstract Result<T> add(@RequestBody T model);

}