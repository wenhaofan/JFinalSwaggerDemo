package live.autu.test;

import com.jfinal.core.Controller;
import com.jfinal.kit.Ret;

import live.autu.plugin.jfinal.swagger.annotation.Api;
import live.autu.plugin.jfinal.swagger.annotation.ApiImplicitParam;
import live.autu.plugin.jfinal.swagger.annotation.ApiImplicitParams;
import live.autu.plugin.jfinal.swagger.annotation.ApiOperation;
import live.autu.plugin.jfinal.swagger.config.RequestMethod;

/**
 * IndexController 指向系统访问首页
 * 
 * @author jbolt.cn
 * @email 2195743583@qq.com
 * @date 2018年11月4日 下午9:02:52
 */
@Api(description = "测试接口")
public class TestController extends Controller {
 
	@ApiOperation(methods=RequestMethod.GET)
	@ApiImplicitParams({
		@ApiImplicitParam(name="userName",required=false,description="这是学员的姓名") 
	})
	public void index() {
		 String name=getPara("userName");
		 renderJson(Ret.ok("msg","测试成功！").set("userName", name));
	}
}