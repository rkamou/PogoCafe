<%@ page import="classes.Np" %>
<div class="col-md-3 mb-3">
    <div class="card">
        <img src="/img/menu/breakfast.jpg" class="card-img-top" alt="">
        <h4 class="my-4">
            <a href="/menu?menuType=<%= Np.Menu.breakfast %>">Breakfast menu</a>
        </h4>
    </div>
</div>
<div class="col-md-3 mb-3">
    <div class="card">
        <img src="/img/menu/lunch.jpg" class="card-img-top" alt="">
        <h4 class="my-4">
            <a href="/menu?menuType=<%= Np.Menu.lunch %>">Lunch menu</a>
        </h4>
    </div>
</div>
<div class="col-md-3 mb-3">
    <div class="card">
        <img src="/img/menu/lunch.jpg" class="card-img-top" alt="">
        <h4 class="my-4">
            <a href="/menu?menuType=<%= Np.Menu.dinner %>">Dinner menu</a>
        </h4>
    </div>
</div>
<div class="col-md-3 mb-3">
    <div class="card">
        <img src="/img/menu/kids.jpg" class="card-img-top" alt="">
        <h4 class="my-4">
            <a href="/menu?menuType=<%= Np.Menu.kids %>">Kids menu</a>
        </h4>
    </div>
</div>