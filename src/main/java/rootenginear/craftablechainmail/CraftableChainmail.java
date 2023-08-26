package rootenginear.craftablechainmail;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.block.Block;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.RecipeHelper;

public class CraftableChainmail implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("craftablechainmail");

    static {
        // Prevent Java compiler to remove unused import
        Block $ = Block.blockOlivine;
    }

    @Override
    public void onInitialize() {
        // Add Recipes
        RecipeHelper.Crafting.createRecipe(new ItemStack(Item.armorHelmetChainmail, 1, 217), new Object[]{
                "AAA",
                "A A",
                'A', Item.chainlink
        });
        RecipeHelper.Crafting.createRecipe(new ItemStack(Item.armorChestplateChainmail, 1, 239), new Object[]{
                "A A",
                "AAA",
                "AAA",
                'A', Item.chainlink
        });
        RecipeHelper.Crafting.createRecipe(new ItemStack(Item.armorLeggingsChainmail, 1, 231), new Object[]{
                "AAA",
                "A A",
                "A A",
                'A', Item.chainlink
        });
        RecipeHelper.Crafting.createRecipe(new ItemStack(Item.armorBootsChainmail, 1, 224), new Object[]{
                "A A",
                "A A",
                'A', Item.chainlink
        });

        LOGGER.info("CraftableChainmail initialized.");
    }
}
