package project2.achievers.DAO.shopper;

import project2.achievers.Entities.Shopper;

public interface ShopperDao {

    Shopper createShopper(Shopper shopper);

    Shopper getShopperLoginByCredentials(String username, String password);

    Boolean delete_a_shopper_account(int shopper_id);

    Boolean select_a_shoppinglist_by_shopper( int shopperid, int shoppinglistid);

    Boolean decline_a_shoppinglist_by_shopper(int Shoppinglistid);



}
