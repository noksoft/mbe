package mx.com.nok.utils.spring;
    


import flex.messaging.FactoryInstance;
import flex.messaging.FlexContext;
import flex.messaging.config.ConfigMap;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;


class SpringFactoryInstance extends FactoryInstance
{
  SpringFactoryInstance(SpringFactory factory, String id, ConfigMap properties)
  {
    super(factory, id, properties); 
  }

  public String toString() {
    return "SpringFactoryInstance id=" + getId() + " Source= " + getSource() + " Scope= " + getScope(); }

  public Object lookup() {
    ApplicationContext appcontext = WebApplicationContextUtils.getWebApplicationContext(FlexContext.getServletConfig().getServletContext());
    String beanName = getSource();
    try {
      return appcontext.getBean(beanName);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
}