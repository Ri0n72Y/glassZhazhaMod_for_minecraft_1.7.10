package net.ri0n72y.gzc.item;

import net.minecraft.block.*;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

/**
 * Item Registry Class
 * @author Ri0n72Y
 *
 * learned from tofucraft by Tsuteto
 *
 */

public class itemGlassCutter extends Item
{

    public itemGlassCutter()
    {
        super();
        this.setMaxDamage(434);
        this.setMaxStackSize(1);
        this.setFull3D();
    }

    @Override
    public boolean onBlockStartBreak(ItemStack itemStack, int x, int y, int z, EntityPlayer player)
    {
        World world = player.getEntityWorld();
        MovingObjectPosition mpos = this.getMovingObjectPositionFromPlayer(world, player, false);

        if (mpos != null && mpos.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK)
        {
            int i = mpos.blockX; int j = mpos.blockY; int k = mpos.blockZ;
            Block block = world.getBlock(i,j,k);
            int dam = getDamage(new ItemStack(getItemFromBlock(block)));

            if (world.canMineBlock(player, i, j, k)&& block != null)
            {
                boolean isCuttable;

                if (block instanceof BlockGlass || block instanceof BlockStainedGlassPane || block instanceof BlockStainedGlass || block instanceof BlockPane) {
                    isCuttable = true;
                } else {
                    isCuttable = false;
                }


                if (isCuttable)
                {
                    itemStack.damageItem(1, player);
                    world.setBlockToAir(i, j, k);

                    if (!world.isRemote)
                    {
                        ItemStack stack = new ItemStack(block);
                        setDamage(stack, dam);

                        EntityItem drop = new EntityItem
                                (world, mpos.hitVec.xCoord, mpos.hitVec.yCoord, mpos.hitVec.zCoord, stack);
                        world.spawnEntityInWorld(drop);
                    }
                    player.playSound(block.stepSound.getBreakSound(), (block.stepSound.getVolume() + 1.0f) / 2.0f, block.stepSound.getPitch() * 0.8f);
                }
            }
        }
        return false;
    }

    /*@Override
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
    {
        MovingObjectPosition mpos = this.getMovingObjectPositionFromPlayer(world, player, false);

        if (mpos != null && mpos.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK)
        {
            int i = mpos.blockX; int j = mpos.blockY; int k = mpos.blockZ;
            Block block = world.getBlock(i,j,k);

            if (world.canMineBlock(player, i, j, k)&& block != null)
            {
                boolean isCuttable;

                if (block instanceof BlockGlass || block instanceof BlockStainedGlassPane || block instanceof BlockStainedGlass || block instanceof BlockPane) {
                    isCuttable = true;
                } else {
                    isCuttable = false;
                }


                if (isCuttable)
                {
                    itemstack.damageItem(1, player);
                    world.setBlockToAir(i, j, k);

                    if (!world.isRemote)
                    {
                        ItemStack stack = new ItemStack(block);
                        EntityItem drop = new EntityItem
                                (world, mpos.hitVec.xCoord, mpos.hitVec.yCoord, mpos.hitVec.zCoord, stack);
                        world.spawnEntityInWorld(drop);
                    }
                    player.playSound(block.stepSound.getBreakSound(), (block.stepSound.getVolume() + 1.0f) / 2.0f, block.stepSound.getPitch() * 0.8f);
                }
            }
        }
        return itemstack;
    }*/

}
