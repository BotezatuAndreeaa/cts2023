public class OfflineViewingDecorator extends SubscriptionDecorator{
    public OfflineViewingDecorator (Subscription subscription) {
        super (subscription) ;

    }

    @Override
    public String getDescription() {
        return subscription.getDescription() + ", vizionare offline";

    }

    @Override
    public double getPrice() {
        return subscription.getPrice() + 5.0;
    }
}

// Decorator pentru adiiugarea de optiune de vizionare in calitate HD
class HDStreamingDecorator extends SubscriptionDecorator {
    public HDStreamingDecorator (Subscription subscription) {
        super (subscription) ;

    }

    @Override
    public String getDescription() {
        return subscription.getDescription() + ", vizionare in calitate HD";

    }

    @Override
    public double getPrice() {
        return subscription.getPrice() + 2.0;

    }
}
