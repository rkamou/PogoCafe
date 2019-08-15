<%@ page import="classes.Np" %>
<div class="modal fade" id="modal__menuItem" tabindex="-1" role="dialog" aria-labelledby="modal__menuItem" aria-hidden="true">
    <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">Menu item</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <i class="ti-close font-size-14"></i>
                </button>
            </div>
            <div class="modal-body py-4">
                <form>
                    <input type="hidden" id="menuItem-id" value="0">
                    <div class="form-group">
                        <label for="menuItem-name" class="col-form-label">Name</label>
                        <input type="text" class="form-control" id="menuItem-name">
                    </div>
                    <div class="form-group">
                        <label for="menuItem-ingredients" class="col-form-label">Ingredients</label>
                        <input type="text" class="form-control" id="menuItem-ingredients">
                    </div>
                    <div class="form-group">
                        <label for="menuItem-price" class="col-form-label">Price</label>
                        <input type="number" class="form-control" id="menuItem-price">
                    </div>
                    <div class="form-group">
                        <label for="menuItem-picture" class="col-form-label">Picture (paste image absolute url from Internet)</label>
                        <input type="text" class="form-control" id="menuItem-picture">
                    </div>
                    <div>
                        <img src="" alt="" width="100%" height="200" id="menuItem-picture-view">
                    </div>

                    <div class="form-group">
                        <label for="menuItem-idCategory" class="col-form-label">Choose category</label>
                        <select data-placeholder="Choose category" class="chosen-select ec-select my_select_box" tabindex="5" id="menuItem-idCategory"></select>
                    </div>
                </form>
            </div>
            <div class="modal-footer py-4">
                <button type="button" class="btn btn-danger" id="menuItem-delete">Delete</button>
                <span style="flex:auto"></span>
                <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-success" id="menuItem-save">Save changes</button>
            </div>
        </div>
    </div>
</div>

<script>
    $(function () {
        $("#menuItem-save").on("click", menuItemSave);
        $("#menuItem-delete").on("click", menuItemDelete);
    });

    function openMenuItemModal(model) {
        $("#menuItem-idCategory").html("");
        for (let cat of categoriesList) {
            $("#menuItem-idCategory").append($("<option>").attr("value", cat.id).text(cat.name));
        }

        if (model && model.id > 0) {
            $("#menuItem-id").val(model.id);
            $("#menuItem-name").val(model.name);
            $("#menuItem-ingredients").val(model.ingredients);
            $("#menuItem-price").val(model.price);
            $("#menuItem-picture").val(model.picture);
            $("#menuItem-idCategory").val(model.idCategory).trigger("chosen:updated");
            $("#menuItem-delete").show();
        } else {
            $("#menuItem-id").val(model.id);
            $("#menuItem-name").val(model.name);
            $("#menuItem-ingredients").val("");
            $("#menuItem-price").val(0.0);
            $("#menuItem-picture").val("");
            $("#menuItem-idCategory").val(0).trigger("chosen:updated");
            $("#menuItem-delete").hide();
        }
        $('#modal__menuItem').modal('show');
    }

    function menuItemSave() {
        $.post("/item-edit", {
            id: $("#menuItem-id").val(),
            name: $("#menuItem-name").val(),
            ingredients: $("#menuItem-ingredients").val(),
            price: $("#menuItem-price").val(),
            picture: $("#menuItem-picture").val(),
            idCategory: $("#menuItem-idCategory").val()
        }).done(function (data) {
            if (ProceedResult(data)) {
                NotificationSuccess("Data saved successfully");
                $('#modal__menuItem').modal('hide');
            }
        }).always(function () {
            reloadAllMenuItems();
        });
    }

    function menuItemDelete() {
        $.post("/item-delete", {
            id: $("#menuItem-id").val()
        }).done(function (data) {
            if (ProceedResult(data)) {
                NotificationSuccess("Menu item deleted successfully");
                $('#modal__menuItem').modal('hide');
            }
        }).always(function () {
            reloadAllMenuItems();
        });
    }
</script>