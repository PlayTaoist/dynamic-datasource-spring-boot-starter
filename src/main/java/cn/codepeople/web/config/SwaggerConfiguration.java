package cn.codepeople.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;

import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@EnableKnife4j
@Import(BeanValidatorPluginsConfiguration.class)
public class SwaggerConfiguration {

	 @Bean(value = "defaultApi2")
	    public Docket defaultApi2() {
	        Docket docket=new Docket(DocumentationType.SWAGGER_2)
	                .apiInfo(apiInfo())
	                //分组名称
	                .groupName("2.X版本")
	                .select()
	                //这里指定Controller扫描包路径(项目路径也行)
	                .apis(RequestHandlerSelectors.basePackage("cn.codepeople.web"))
	                .paths(PathSelectors.any())
	                .build();
	        return docket;
	    }
	 
	    private ApiInfo apiInfo() {
	        return new ApiInfoBuilder()
	                .title("BaoMiDou动态数据源测试")
	                .description("BaoMiDou动态数据源测试接口")
	                .termsOfServiceUrl("http://localhost:8838/")
	                .version("1.0")
	                .build();
	    }
}