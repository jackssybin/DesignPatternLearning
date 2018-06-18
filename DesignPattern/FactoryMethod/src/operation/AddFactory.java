package operation;

/**
 专门负责生产"+"的工厂

 */
public class AddFactory implements IFactory
{
    public final Operation CreateOperation()
    {
        return new OperationAdd();
    }
}
