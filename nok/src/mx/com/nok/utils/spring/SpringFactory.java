package mx.com.nok.utils.spring;


import flex.messaging.FactoryInstance;
import flex.messaging.FlexFactory;
import flex.messaging.config.ConfigMap;

public class SpringFactory
  implements FlexFactory
{
  public FactoryInstance createFactoryInstance(String id, ConfigMap properties)
  {
    SpringFactoryInstance instance = new SpringFactoryInstance(this, id, properties);
    instance.setSource(properties.getPropertyAsString("source", instance.getId()));
    return instance;
  }

  public Object lookup(FactoryInstance inst) {
    SpringFactoryInstance factoryInstance = (SpringFactoryInstance)inst;
    return factoryInstance.lookup();
  }

  public void initialize(String id, ConfigMap configmap)
  {
  }
}