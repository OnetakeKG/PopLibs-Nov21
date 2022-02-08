package ru.fylmr.poplibs_nov21.ui.base

interface IListPresenter<V : IItemView> {

    var itemClickListener: () -> Unit

    fun getCount(): Int

    fun bindView(view: V)
}